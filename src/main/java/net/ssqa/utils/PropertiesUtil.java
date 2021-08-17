package net.ssqa.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import net.ssqa.constants.FrameworkConstants;
import java.util.Map.Entry;


public final class PropertiesUtil {
	
private PropertiesUtil() {}
	
	private static final Properties prop=new Properties();
	private static final Map<String, String> CONFIGMAP=new HashMap<String, String>();
	
	static
	{
		FileInputStream file;
		try
		{
			file = new FileInputStream(FrameworkConstants.getConfigFilePath());
			prop.load(file);
			
			for(Entry<Object, Object> entry:prop.entrySet())
			{
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key) throws Exception
	{
		if(Objects.isNull(key)|| Objects.isNull(CONFIGMAP.get(key)))
		{
			throw new Exception("Property name "+key+" is not found Please check the config.properties");
		}
		return CONFIGMAP.get(key);
	}

}
