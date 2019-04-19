package com.yourname.projectname.core.prison;

import com.yourname.projectname.core.prison.cell.BasicCell;
import com.yourname.projectname.core.prison.cell.Cell;
import com.yourname.projectname.core.prison.cell.SolitaryCell;
import com.yourname.projectname.core.prison.person.CrimeType;
import com.yourname.projectname.core.prison.person.Offender;

public class Prison {

    public Prison() {
        Block blockA = new Block('A');
        Cell cell1 = new BasicCell(5.00, 5.00);
        Cell cell2 = new BasicCell(5.00, 5.00);
        Cell cell3 = new SolitaryCell(3.00, 3.00);
        blockA.addCell(cell1);
        blockA.addCell(cell2);
        blockA.addCell(cell3);

        cell1.addOffender(new Offender("Davorin", "Drozg", CrimeType.HACKING));
    }
}
