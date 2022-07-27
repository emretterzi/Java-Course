public class Engineer  extends Worker{


//java da sadece 1 kez kalıtım kullanabilirsiniz

  public String title;



    public Engineer(String name, int salary, String title) {
        super(name, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

