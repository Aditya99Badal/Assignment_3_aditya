package ITER;

public class A3_HA_Q3 {
    public static void main(String[] args) {

        int month = ( int ) (1+(Math.random()*11));
        String a =" ";
        switch ( month )
        {
            case 1 : a = " january " ; break ;
            case 2 : a = " February " ; break ;
            case 3 : a = " March " ; break ;
            case 4 : a = " April " ; break ;
            case 5 : a = " may " ; break ;
            case 6 : a = " June " ; break ;
            case 7 : a = " July " ; break ;
            case 8 : a = " August " ; break ;
            case 9 : a = " September " ; break ;
            case 10 : a = " October " ; break ;
            case 11 : a = " November " ; break ;
            case 12 : a = " December " ;
        }
        System.out.println( a );
    }
}
