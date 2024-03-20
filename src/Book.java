class Book implements Comparable<Book> {
    private int pageCount;
    private String name;
    private String authorName;
    private String publishDate;

    public Book(String name, int pageCount, String authorName, String publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Page Count: " + pageCount + ", Author: " + authorName + ", Publish Date: " + publishDate;
    }
}
