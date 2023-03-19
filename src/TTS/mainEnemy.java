
package TTS;


public class mainEnemy {
    public static void main(String[] args) {
        Jet j= new Jet(32000, 70, "Jet", "Duelist", 150);
        j.setSkill("Cloudburst", "Updraft", "Tailwind", "Blade Storm - Ultimate");
        j.infoJet();
        System.out.println("Skill Jet");
        j.tampilSkillJet();
        j.attack();
        j.fungsiJet();
        System.out.println("============");
        Sage s = new Sage(17000, 40, "Sage", "Sentinel", 150);
        s.setSkill("Barrier Orb", "Slow Orb", "Healing Orb", "Ressurection-Ultimate");
        s.infoSage();
        System.out.println("Skill Sage");
        s.tampilSkillSage();
        s.attack();
        s.fungsiSage();
    }
}
