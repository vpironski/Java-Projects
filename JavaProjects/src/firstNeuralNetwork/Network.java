package firstNeuralNetwork;


public class Network{

    private double[][] output;
    private double[][][] weight;
    private double [][] bias;


    public final int[] Network_Layer_Size;
    public final int Input_Size;
    public final int Output_Size;
    public final int Network_Size;

    public Network(int[] NETWORK_LAYER_SIZE) {
        this.Network_Layer_Size =  NETWORK_LAYER_SIZE;
        this.Input_Size = NETWORK_LAYER_SIZE[0];
        this.Network_Size = NETWORK_LAYER_SIZE[NETWORK_LAYER_SIZE.length];
        this.Output_Size = NETWORK_LAYER_SIZE[Network_Size-1];

        this.output = new double[Network_Size][];
        this.weight = new double[Network_Size][][];
        this.bias = new double[Network_Size][];

        for (int i = 0; i < Network_Size; i++) {
            this.output[i] = new double[NETWORK_LAYER_SIZE.length];
            this.bias[i] = new double[NETWORK_LAYER_SIZE.length];

            if(i>0){
                weight[i] = new double[NETWORK_LAYER_SIZE[i]][NETWORK_LAYER_SIZE[i-1]];
            }
        }
    }



    public static void main(String[] args) {
//        Network net = new Network();

    }

}
