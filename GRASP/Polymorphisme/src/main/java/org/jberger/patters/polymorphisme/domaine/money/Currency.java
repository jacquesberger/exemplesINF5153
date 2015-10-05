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

package org.jberger.patters.polymorphisme.domaine.money;

public class Currency {
    int pennies = 0;
    
    static public Currency parseFromString(String in) {
        Currency result = new Currency();
        
        String[] parts = in.split(",");
        result.pennies = Integer.parseInt(parts[0]) * 100;
        result.pennies += Integer.parseInt(parts[1]);
        
        return result;
    }
    
    public Currency add(Currency cur) {
        Currency result = new Currency();
        result.pennies = this.pennies + cur.pennies;
        return result;
    }
    
    public Currency applyPourcentage(double rate) {
        Currency result = new Currency();
        result.pennies = (int) Math.round(this.pennies * rate);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d,%02d", pennies / 100, pennies % 100);
    }
}
