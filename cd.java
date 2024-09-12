public class cd extends product{
    private String artist;
    private int numSong;
    private String label;

   public cd (){ 
    super(); //mengakses constructor
    artist = "";
    numSong = 0;
    label = "";
   }

   public cd(int number, String nama, int quantity, int price, String artist, int numSong, String label) {
    super(number, nama, quantity, price);
    this.artist = artist;
    this.numSong = numSong;
    this.label = label;
}

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yg sama dengan method di superclassnya

    public void print(){
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("Total song: " + numSong);
        System.out.println("label: " + label);
        System.out.println("");
        System.out.println("================================");
        System.out.println("");
    }
}
