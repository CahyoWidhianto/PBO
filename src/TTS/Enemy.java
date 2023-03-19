
package TTS;


public abstract class Enemy {
    String name, role;
    int hp;

    public Enemy(String name, String role, int hp) {
        this.name = name;
        this.role = role;
        this.hp = hp;
    }

    public abstract void attack();
    public void info(){
        System.out.println("nama : " + name);
        System.out.println("hp : " + hp);
        System.out.println("role : " + role);
    }
}
    

