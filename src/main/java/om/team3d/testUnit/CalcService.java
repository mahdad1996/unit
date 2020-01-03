package om.team3d.testUnit;

public class CalcService {

    private SubtractService subtractService;

    public CalcService(SubtractService subtractService){
        this.subtractService = subtractService;

    }

    public int calc(int num1,int num2){
        return subtractService.Subtract(num1,num2);
    }
}
