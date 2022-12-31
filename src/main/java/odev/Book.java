package odev;

public class Book {


    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        if(pageNumber>0) {
            this.pageNumber = pageNumber;
        }else {
            System.out.println("Negatif olmaz");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getPageNumber(){

        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){

        if(pageNumber>0){
            this.pageNumber=pageNumber;
        }else {
            System.out.println("Negatif sayi giremwzsiniz...");
        }


    }

}