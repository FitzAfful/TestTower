/**
 * @author Daniel Koranteng <danito2060@gmail.com>
 * @version 1.0
 */

class Person extends Human {
    @Override
    public String speak() {
        return "I am speaking out loud!";
    }

    @Override
    public String walk() {
        return "I am walking.";
    }
}