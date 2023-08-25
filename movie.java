public class movie {

    private String title;

    public movie(String title) {
        this.title = title;
    }
    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static movie getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'A' ->
                    new action(title);
            case 'T' ->
                    new thriller(title);
            case 'C' ->
                    new comedy(title);
            default ->
                    new movie(title);
        };
    }
}
class action extends movie {
    public action(String title) {
        super(title);
    }
    @Override //  indicates that the "action" class method is over-writing its base class method.
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Fighting Scene", "Suspense Music", "Something Dangerous Happens");


    }
}
class thriller extends movie {
    public thriller(String title) {
        super(title);
    }
    @Override //  indicates that the "child" class method is over-writing its base class method.
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something Bad Happens", "Something Worst Happens", "Cliffhanger Ending");
    }
}
class comedy extends movie {
    public comedy(String title) {
        super(title);
    }
    @Override //  indicates that the "child" class method is over-writing its base class method.
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something Funny Happens", "Something Even Funnier Happens", "Happy Ending");
    }
}