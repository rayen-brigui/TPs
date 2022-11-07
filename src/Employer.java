public class Employer {
    private String Nom;
    private String Prenom;
    private int Salaire;
    private String Age;
   public Employer(Employer p1){
    setAge(p1.Age);
    setNom(p1.Nom);
    setPrenom(p1.Prenom);
    setSalaire(p1.Salaire);
   }
   /***********Getters */
   public String getAge() {
       return Age;
   }
   public String getNom() {
       return Nom;
   }
   public String getPrenom() {
       return Prenom;
   }
   public int getSalaire() {
       return Salaire;
   }

   //*******setters */
   public void setAge(String age) {
       Age = age;
   }
   public void setNom(String nom) {
       Nom = nom;
   }
   public void setPrenom(String prenom) {
       Prenom = prenom;
   }
   public void setSalaire(int salaire) {
       Salaire = salaire;
   }
   /*Constructor */
   public Employer(String N, String Pr, int S, String A){
       setAge(A);
        setNom(N);
        setPrenom(Pr);
        setSalaire(S);
   } 
   @Override
   public String toString() {
       String CH="\n Nom: "+this.Nom+"\n Prenom: "+this.Prenom+"\n Age: "+Age+"\n Salaire: "+Salaire;
       return CH;
   }
   public void Augmenter(int value){
    Salaire=Salaire+value;
   }
   public void afficher() {
    System.out.println(this.toString());
   }
   
}
