/* Copyright 2015 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.patterns.controleur.presentation.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.jberger.patterns.controleur.application.session.TaxController;
import org.jberger.patterns.controleur.domaine.taxes.InvoiceTotals;

public class UserInteraction {
    private final TaxController controller;
    private final BufferedReader reader;
    
    public UserInteraction() {
        controller = new TaxController();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void calculateTaxesForSpecificRegion() throws IOException {
        displayRegionChoices();
        int region = readRegionChoice();
        controller.setRegion(region);
        displaySubtotalQuestion();
        String amount = readInvoiceSubtotal();
        InvoiceTotals totals = controller.getInvoiceTotals(amount);
        displayTotals(totals);
    }
    
    private void displayRegionChoices() {
        System.out.println("Choisissez une région :");
        System.out.println("1- Québec");
        System.out.println("2- Territoires");
        System.out.print("Votre choix : ");
    }
    
    private int readRegionChoice() throws IOException {
        String temp = reader.readLine();
        return Integer.parseInt(temp);
    }
    
    private void displaySubtotalQuestion() {
        System.out.print("Entrez le sous-total de la facture : ");
    }
    
    private String readInvoiceSubtotal() throws IOException {
        return reader.readLine();
    }
    
    private void displayTotals(InvoiceTotals totals) {
        System.out.println("===== Facture =====");
        System.out.println("Sous-total : " + totals.getSubtotal());
        System.out.println("Taxes fédérales : " + totals.getFederal());
        System.out.println("Taxes provinciales : " + totals.getProvincial());
        System.out.println("Total : " + totals.getTotal());
    }
}