import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Character Manager v0.1 ===");

        // Membuat 3 karakter
        Character hero = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );

        Character wizard = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character scout = new Character(
            "Athena", CharacterType.ARCHER, 4
        );

        // Menampilkan karakter
        System.out.println(hero);
        System.out.println(wizard);
        System.out.println(scout);

        // Demo level up
        System.out.println();
        System.out.println(">> " + hero.getName() + " level up!");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("After level up: " + hero);

        // Menampilkan informasi karakter
        System.out.println();
        System.out.println(">> Nama karakter: " + hero.getName());
        System.out.println(">> Jenis karakter: " + hero.getType());
        System.out.println(">> HP saat ini: " + hero.getHitPoints());

        // ===== MINI CHALLENGE =====
        System.out.println();
        System.out.println("=== MINI CHALLENGE ===");

        Character necromancer = new Character(
            "Raven", CharacterType.MAGE, 7
        );

        // Mengatur mana
        necromancer.setMana(200);

        // Menampilkan karakter
        System.out.println(necromancer);

        // Memeriksa apakah karakter masih hidup
        System.out.println(
            "Apakah Raven masih hidup? " + necromancer.isAlive()
        );

        // Menampilkan mana
        System.out.println(
            "Mana Raven: " + necromancer.getMana()
        );
    }
}