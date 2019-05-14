package project.interfaces;

public interface IDoctor extends IEnquirer, IAnswerReceptacle, ITableProducerReceptacle, ITreeProducerReceptacle{
    public void connect(IPatient patient);
    public void connect(ITreeProducer tree);
    public void connect(ITableProducer table);
}
