package net.ssqa.testcase;

import org.testng.annotations.Test;
import net.ssqa.pages.AmenitiesPage;
import net.ssqa.pages.FacilityInfoPage;
import net.ssqa.pages.HomePage;
import net.ssqa.pages.NewFacilityManagerPage;
import net.ssqa.pages.PhotosPage;
import net.ssqa.pages.SubmitReviewPage;
import net.ssqa.pages.TherapistInfomationPage;
import net.ssqa.utils.GenerateData;

public class RegisrationPageTests extends BaseTest {

	@Test
	public void testUserRegistration() {
		HomePage spahomepage = new HomePage();
		spahomepage.clickApplyNow();

		NewFacilityManagerPage facilitymanagerpage = new NewFacilityManagerPage();
		facilitymanagerpage.enterFacilityName(GenerateData.randomFirstName());
		facilitymanagerpage.enterCity("Atlanta");
		facilitymanagerpage.selectState("Georgia");
		facilitymanagerpage.enterFirstName(GenerateData.randomFirstName());
		facilitymanagerpage.enterLastName("lastname");
		facilitymanagerpage.enterEmail(GenerateData.randomEmail());
		facilitymanagerpage.enterPhone("89865898");
		facilitymanagerpage.enterPassword("pass@123");
		facilitymanagerpage.enterConfirmPassword("pass@123");
		facilitymanagerpage.clickContinue();

		FacilityInfoPage facilityinfopage = new FacilityInfoPage();
		facilityinfopage.enterURL("http://www.google.com/");
		facilityinfopage.clickTimeZone();
		facilityinfopage.clickOptionEasternTime();
		facilityinfopage.enterPhoneNumber("8986589822");
		facilityinfopage.enterAddress1("address1 dummy");
		facilityinfopage.enterZipCode("12345");
		facilityinfopage.enterShortDescription("Test");
		facilityinfopage.enterDescribeFacility("Test");
		facilityinfopage.clickNext();

		AmenitiesPage amenitiespage = new AmenitiesPage();
		amenitiespage.clickcheckboxDrySauna();
		amenitiespage.clickDrySaunaCell();
		amenitiespage.enterDrySaunaDescription("Test");
		amenitiespage.clickIncludedDrySauna();
		amenitiespage.clickCellAddChargeDrySauna();
		amenitiespage.enterAddChargesDrySauna("25");
		amenitiespage.clickPage();
		amenitiespage.clickNext();

		TherapistInfomationPage therapistinfomationpage = new TherapistInfomationPage();
		therapistinfomationpage.enterParkingInfo("Test Parking");
		therapistinfomationpage.enterUniformInfo("Test Uniform");
		therapistinfomationpage.enterCheckinInfo("Test Checkin");
		therapistinfomationpage.enterAdditionalInfo("Test Additional");
		therapistinfomationpage.clickNext();

		PhotosPage photospage = new PhotosPage();
		photospage.enterPhotopath();
		photospage.clickUpload();
		photospage.clickNext();
		
		SubmitReviewPage submitreviewpage = new SubmitReviewPage();
		submitreviewpage.clickSubmitForReview();
	}
}
