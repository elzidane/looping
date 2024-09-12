public class dvd extends product{
    private int leght;
    private String rating;
    private String studio;

    public dvd(){
        super();
        leght = 0;
        rating = "";
        studio = "";
    }

    //consructor parameter
    public dvd(int number, String nama, int quantity, int price, int leght, String rating, String studio) {
        super(number, nama, quantity, price);
        this.leght = leght;
        this.rating = rating;
        this.studio = studio;
    }

    public int getLeght() {
        return leght;
    }
    public void setLeght(int leght) {
        this.leght = leght;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override

    public void print(){
        super.print();
        System.out.println("Leght: " + leght);
        System.out.println("Rating: " + rating);
        System.out.println("studio: " + studio);
        System.out.println("");
        System.out.println("================================");
        System.out.println("");
    }
}
