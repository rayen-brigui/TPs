import javax.lang.model.type.NullType;

public class Test {
    public static void main(String[] args) {
        Employer E1 = new Employer("foulen","ben foulen",1500,"20");
        Technicien T1 = new Technicien("mouhamed","Ali", 2000, "25", 1);
        E1.afficher();
        T1.afficher();
        E1.Augmenter(500);
        T1.setGrade(2);
        T1.Augmenter();
        T1.afficher();
        E1.afficher();
        Technicien T2 = new Technicien("mouhamed","Ali", 2000, "25", 1);
        Technicien T3 = new Technicien("mouha","Ali", 3000, "25", 2);
        Technicien T4 = new Technicien("hamidou","Ali", 1000, "25", 5);
        Technicien T5 = new Technicien("hamed","Ali", 2560, "25", 5);
        Technicien[] Ta ={T1,T2,T3,T4,T5};
        Technicien[] Ta2 =new Technicien[10];
        Equipe E = new Equipe(Ta);
        String maxTec="";
        Technicien maxTech=new Technicien(T1);
        int maxGrade=1;
        int maxSalaire=0;
        for (Technicien technicien : Ta) {
            if (technicien.getSalaire()>maxSalaire){
                maxSalaire=technicien.getSalaire();
                maxTech=new Technicien(technicien);
            }
            if (technicien.getGrade()>maxGrade) {
                maxGrade=technicien.getGrade();

            }
        }
        int i =0;
         for (Technicien technicien : Ta) {
            if(technicien.getGrade()==maxGrade){
               Ta2[i]=new Technicien(technicien);
               i++;
            }
        }
        System.out.println("le plus cher technicien est "+maxTech.getNom()+" avec un salaire :"+maxTech.getSalaire());
        System.out.println("\n le(s) technicien(s) ayant le plus grand grade sont =[");
        for (Technicien technicien : Ta2) {
            if(technicien==null){
                break;
            }else{
                technicien.afficher();
            System.out.println("****************");
            }
            
        }
        System.out.println("]");

        
    }
}
