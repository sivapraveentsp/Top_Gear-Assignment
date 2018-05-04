package Core_java;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class MyFileGZipExamp 
{
	public void doGzip(String filePath,String gzipFile)
	{ 
		try {
            FileInputStream fis = new FileInputStream(filePath);
            FileOutputStream fos = new FileOutputStream(gzipFile);
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while((len=fis.read(buffer)) != -1){
                gzipOS.write(buffer, 0, len);
            }
            gzipOS.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	} 
	public void doUnGzipFile(String gzipFile,String newFile) 
	{ 
	    try {
            FileInputStream fis = new FileInputStream(gzipFile);
            GZIPInputStream gis = new GZIPInputStream(fis);
            FileOutputStream fos = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int len;
            while((len = gis.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
            //close resources
            fos.close();
            gis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) 
	{
		MyFileGZipExamp mfg = new MyFileGZipExamp(); 
		mfg.doGzip("F:/test.txt","F:/test.txt.gzip"); 
		mfg.doUnGzipFile("F:/test.txt.gzip","F:/test_new.txt");
		
	}

}
