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

package org.jberger.patterns.factmethod.domaine.taxes;

import org.jberger.patters.factmethod.domaine.money.Currency;

public class TaxTotals {
    private final Currency subtotal;
    private final Currency federal;
    private final Currency provincial;
    private final Currency total;
    
    public TaxTotals(Currency subtotal, Currency federal, Currency provincial, Currency total) {
        this.subtotal = subtotal;
        this.federal = federal;
        this.provincial = provincial;
        this.total = total;
    }

    public Currency getSubtotal() {
        return subtotal;
    }

    public Currency getFederal() {
        return federal;
    }

    public Currency getProvincial() {
        return provincial;
    }

    public Currency getTotal() {
        return total;
    }
}
