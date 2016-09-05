import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class DeleteTempFilesInHybris
{
	private static String BIN_DIR_NAME = "bin";
	private final boolean simulateDelete;

	public DeleteTempFilesInHybris(boolean simulateDelete)
	{
		this.simulateDelete = simulateDelete;
	}

	public void doAction(String pathToHybris)
	{
		File hybris = new File(pathToHybris);

		if (!hybris.isDirectory())
		{
			throw new RuntimeException("Selected path is not a directory.");
		}

		checkIsHybris(hybris);
		List<File> filesToDelate = toBeDeleted(hybris);
		printFilesToDelete(filesToDelate);
		deleteFiles(filesToDelate);
	}

	private void deleteFiles(final List<File> filesToDelate)
	{
		for (File f : filesToDelate)
		{
			if (f.isDirectory())
			{
				removeDirectoryContent(f);
			}
			deleteFile(f);
		}
	}

	/**
	 * Usuwa wszystko co jest w danym folderze
	 */
	private void removeDirectoryContent(File file)
	{
		for (File fileToRemove : file.listFiles())
		{
			if (fileToRemove.isDirectory())
			{
				removeDirectoryContent(fileToRemove);
			}
			deleteFile(fileToRemove);
		}
	}


	private void deleteFile(final File fileToDelate)
	{
		if (simulateDelete)
		{
			System.out.println("Removing file: " + fileToDelate.getAbsolutePath());
		}
		else
		{
			fileToDelate.delete();
		}
	}


	private void printFilesToDelete(List<File> files)
	{
		for (File f : files)
		{
			String filename = f.getAbsolutePath();
			System.out.println(filename);
		}
	}

	private void checkIsHybris(final File hybris)
	{
		File[] content = hybris.listFiles();
		for (File g : content)
		{
			boolean isDir = g.isDirectory();
			boolean isBin = g.getName().equals(BIN_DIR_NAME);
			if (isDir && isBin)
			{
				return;
			}
		}
		throw new RuntimeException("Selected directory does not contain a bin directory.");
	}

	private List<File> toBeDeleted(File hybrisDirectory)
	{
		List<File> result = new ArrayList<File>();

		for (File f : hybrisDirectory.listFiles())
		{
			boolean isLog = f.getName().equals("log");
			boolean isTemp = f.getName().equals("temp");
			if ((isLog && f.isDirectory()) || (isTemp && f.isDirectory()))
			{
				result.add(f);
			}
		}
		return result;
	}
}

