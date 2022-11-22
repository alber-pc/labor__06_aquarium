import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;

public class FischMain {
    public static void main(String[] args) {
        EasyCanvas ec = new EasyCanvas(400, 400);
        ec.show();

        List<IFisch> fische = new ArrayList<>();
        fische.add(new MeinFisch(100, 300));
        fische.add(new MeinFisch(200, 200));
        fische.add(new MeinFisch(300, 100));

        for(IFisch fisch : fische) {
            fisch.zeichne(ec);
            }
        }

}