import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Computers lenovoAlphaOmega =
                new Computers("Lenovo 3k", 27.5,
                        true, BigDecimal.valueOf(35874),
                            true);
        Computers applePeach =
                new Computers("AppleMiracle Peache", 32.8);

        List<Computers> pcList = new ArrayList<>();
        pcList.add(lenovoAlphaOmega);
        pcList.add(applePeach);
        System.out.println(pcList.get(0).getPrice() +
                " "+ pcList.get(0).getModel());
        System.out.print(pcList.size());

        Employees linda = new Employees("Linda Mrtvá",
                LocalDate.of(2000, 2,15));
        Employees marek = new Employees("Marek Mračivý",
                LocalDate.of(1997, 12, 16));

        linda.addComputer(lenovoAlphaOmega);
        linda.addComputer(
                new Computers(
                        "Kancelář Yvona",
                        new BigDecimal("28817.18")));
    }
}
