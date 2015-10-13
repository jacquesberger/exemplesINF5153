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

package org.jberger.patterns.facade.domaine.taxes;

import org.jberger.patterns.facade.fondation.money.Currency;

public class DomainFacade {
  private SalesTaxes calculator;
    
    public void setRegion(int region) {
        if (region == 1) {
            calculator = new QuebecTaxes();
        } else if (region == 2) {
            calculator = new TerritoriesTaxes();
        } else {
            calculator = null;
        }
    }
    
    public InvoiceTotals getInvoiceTotals(String sub) {
        Currency subtotal = Currency.parseFromString(sub);
        return calculator.calculate(subtotal);
    }  
}
