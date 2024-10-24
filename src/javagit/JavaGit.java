package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /*ha hideg van akkor viszek kabatot egyebkent nem viszek kabatot*/
        int homerseklet = 11;
        boolean hideg = homerseklet < 10;
        String kabat = hideg ? "viszek kabatot" : "nem viszek kabatot";
        System.out.println(kabat);
    }
    
}
