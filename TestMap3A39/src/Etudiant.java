public class Etudiant {
    private int id;
    private String nom,prenom;

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Etudiant et=(Etudiant) obj;
        if(et.id==id && et.nom.equals(nom))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return id+nom.hashCode();
    }
}
