
public class Application
{
	private static final String START = "/Users/i325420/dev/hybris/hybris";
	private static final boolean SIMULATE_DELETE = true;

	public static void main(String[] args) {
		DeleteTempFilesInHybris deleteTempFilesInHybris = new DeleteTempFilesInHybris(SIMULATE_DELETE);
		deleteTempFilesInHybris.doAction(START);

	}
}
