package src.Backend;


public class Backround{
    private String name;
    private String desc;
    private Attributes[] skill_profs;
    private Languages[] languages_to_choose;
    private int languages_count;
    //TODO: Starting items

    public Backround(String name, String desc, Attributes[] skill_profs, Languages[] languages_to_choose, int languages_count){
        this.name = name;
        this.desc = desc;
        this.skill_profs = skill_profs;
        this.languages_to_choose = languages_to_choose;
        this.languages_count = languages_count;

    }


    public String get_name(){
        return this.name;
    }

    public String get_desc(){
        return this.desc;
    }

    public Attributes[] get_skill_profs(){
        return this.skill_profs;
    }

    public Languages[] get_languages_to_choose(){
        return this.languages_to_choose;
    }

    public int get_languages_count(){
        return this.languages_count;
    }

}