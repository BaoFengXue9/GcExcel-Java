package com.grapecity.documents.excel.examples.features.pagesetup;

import java.net.URL;

import com.grapecity.documents.excel.IWorksheet;
import com.grapecity.documents.excel.Workbook;
import com.grapecity.documents.excel.examples.ExampleBase;

public class ConfigPrintTitleRows extends ExampleBase {

    @Override
    public void execute(Workbook workbook) {

        URL url = ClassLoader.getSystemResource("xlsx/PageSetup Demo.xlsx");
        String filePath = url.getPath().substring(1).replaceAll("%20", " ");
        workbook.open(filePath);
        IWorksheet worksheet = workbook.getWorksheets().get(0);

        //Set rows to repeat at top
        worksheet.getPageSetup().setPrintTitleRows("$5:$10");

    }

}