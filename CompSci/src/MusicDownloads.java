import java.util.ArrayList;

public class MusicDownloads {
	/** The list of downloaded information.
	 * Guaranteed not to be null and not to contain duplicate titles.
	 */
	private List<DownloadInfo> downloadList;
	/** Creates the list of downloaded information. */
	public MusicDownloads()
	{ downloadList = new ArrayList(); }
	/** Returns a reference to the DownloadInfo object with the requested title if it exists.
	 * @param title the requested title
	 * @return a reference to the DownloadInfo object with the
	 * title that matches the parameter title if it exists in the list;
	 * null otherwise.
	 * Postcondition: * - no changes were made to downloadList.
	 */
	public DownloadInfo getDownloadInfo(String title)
	{ /* to be implemented in part (a) */ 
		for(int k = 0; k<downloadList.size(); k++) {
			
		}
	}
	/** Updates downloadList with information from titles.
	 * @param titles a list of song titles * Postcondition:
	 * - there are no duplicate titles in downloadList.
	 * - no entries were removed from downloadList.
	 * - all songs in titles are represented in downloadList.
	 * - for each existing entry in downloadList, the download count is increased by
	 * the number of times its title appeared in titles.
	 * - the order of the existing entries in downloadList is not changed.
	 * - the first time an object with a title from titles is added to downloadList, it
	 * is added to the end of the list.
	 * - new entries in downloadList appear in the same order
	 * in which they first appear in titles.
	 * - for each new entry in downloadList, the download count is equal to
	 * the number of times its title appeared in titles.
	 */
	public void updateDownloads(List<String> titles)
	{ /* to be implemented in part (b) */ }
	// There may be instance variables, constructors, and methods that are not shown.
}
(a) Write