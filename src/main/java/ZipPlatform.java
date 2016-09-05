/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipPlatform
{
	static final int BUFFER = 2048;

	public static void main(String args[])
	{
		/*try
		{
			BufferedOutputStream source = null;
			FileOutputStream zipFile = new FileOutputStream("platform.zip");
			ZipOutputStream zipZip = new ZipOutputStream(new BufferedOutputStream(zipFile));
			byte data[] = new byte[BUFFER];
			File f = new File("hybris");
			String allFiles[] = f.list();
			for (File f : allFiles)

			{
				FileInputStream input = new FileInputStream(allFiles[f]);
					if (f.isDirectory())
					{
						String path = basePath + f.getName() + "/";
						zipZip.putNextEntry(new ZipEntry(path));
						zipSubDir(path, f, zipZip);
						zipZip.closeEntry();
					} else {


				source = new BufferedInputStream(input, BUFFER);
				ZipEntry entry = new ZipEntry(allFiles[f]);
				zipZip.putNextEntry(entry);
				int count;
				while ((count = source. (data, 0, BUFFER))!=-1){
				zipZip.write(data, 0, count);
			}
				source.close();
			} zipZip.close();
		}

	} catch (IOException e) {
			e.printStackTrace();
		}*/
}






/**	private static final String INPUT_FILE =
	*************
	private static final String OUTPUT_FILE =
	*************
	public static void main (String [] args) {
		zipPlatform(new File(INPUT_FILE), OUTPUT_FILE);

	public static void zipPlatform (new File(INPUT_FOLDER), ZIPPED_FOLDER)
			try {
			File y = new File(path????);
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(y));
			ZipEntry z = new ZipEntry(***file from files***);
			out.putNextEntry(z);

			out.close();


	} catch (Exception e){
		e.printStackTrace();
	}
	}              */
}
