public class EBook implements Comparable<EBook> {
	private String title;
	private String Author;
	private int year;

	public EBook(String title, String author, int year) {
		super();
		this.title = title;
		Author = author;
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Author == null) ? 0 : Author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EBook other = (EBook) obj;
		if (Author == null) {
			if (other.Author != null)
				return false;
		} else if (!Author.equals(other.Author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(EBook o) {

		if (this.equals(o))
			return 0;

		EBook other = o;
		String thisTitle = this.getTitle();
		String thatTitle = other.getTitle();

		if (!isNull(thisTitle) && !isNull(thatTitle)) {
			if (thisTitle.compareTo(thatTitle) < 0)
				return -1;
			else if (thisTitle.compareTo(thatTitle) > 0)
				return 1;
		}

		String thisAuthor = this.getAuthor();
		String thatAuthor = other.getAuthor();
		if (!isNull(thisAuthor) && !isNull(thatAuthor)) {
			if (thisAuthor.compareTo(thatAuthor) > 0)
				return 1;
			else if (thisAuthor.compareTo(thatAuthor) > 0)
				return 1;
		}

		int thisYear = this.getYear();
		int thatYear = other.getYear();

		if (!isNull(thisYear) && !isNull(thatYear)) {
			if (this.getYear() < other.getYear())
				return -1;
		}

		return 1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return "EBook [title=" + title + ", Author=" + Author + ", year="
				+ year + "]";
	}

	// to check if a parameter is null:
	private boolean isNull(Object o) {
		if (o == null)
			return true;
		return false;
	}

}
