

package application;

;

public class Album extends Media implements Comparable<Album> {

	protected String artist;
	protected String songs;
	protected String code;
	public Album() {
		
	}


	public Album(String title, int copiesAvailable, String artist, String songs,String theCode) {
		super( title,copiesAvailable);
		this.artist = artist;
		this.songs = songs;
		this.code=theCode;

	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}

	@Override
	public int compareTo(Album o) {

		if(this.artist.compareTo(o.artist)>0) {
			return 1;
		}
		else if(this.getArtist().compareTo(((Album) o).getArtist())<0) {
			return -1;
		}
		else 
		{
			return 0;
		}
	}


	@Override
	public String toString() {
		return "Album [artist=" + artist + ", songs=" + songs + ", code=" + code + "]";
	}
	

}
