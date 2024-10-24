package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /*ha hideg van akkor viszek kabatot egyebkent nem viszek kabatot*/
        final int HIDEG_HATAR = 10;
        int homerseklet = 11;
        String eredmeny = "viszek kabatot";
        boolean hideg = homerseklet < HIDEG_HATAR;
        String kabat = hideg ? eredmeny : "nem" + eredmeny;
        System.out.println(kabat);
    }
    
}
