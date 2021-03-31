package patterns.composite.neural;

class Demo {
    public static void main(String[] args) {
        final Neuron neuron = new Neuron();
        final Neuron neuron2 = new Neuron();

        final NeuronLayer layer = new NeuronLayer();
        final NeuronLayer layer2 = new NeuronLayer();

        neuron.connectTo(neuron2);
        neuron.connectTo(layer);
        layer.connectTo(neuron);
        layer.connectTo(layer2);
    }
}
