package ordenador;

/**
 *
 * @author jalvarezbarciela
 */
public class CPU {
    private int speed;
    private int memory;
    /**
     * Builder whit parameters
     * @param velocidade This variable save the speed of the CPU
     * @param memoria This variable save the memory of the CPU
     */
    public CPU(int velocidade, int memoria) {
        this.speed = velocidade;
        this.memory = memoria;
    }
    public CPU() {

    }
    /**
     * Method to set the speed of the CPU
     * @param speed This variable save the speed of the CPU
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     * Method to set the speed of the CPU
     * @param memory This variable save the memory of the CPU
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }
    /**
     * Method to get the value of the speed
     * @return speed This variable save the speed of the CPU
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * Method to get the value of the speed
     * @return memory  This variable save the memory of the CPU
     */
    public int getMemory() {
        return memory;
    }
}
