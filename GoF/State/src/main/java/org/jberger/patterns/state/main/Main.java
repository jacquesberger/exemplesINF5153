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

package org.jberger.patterns.state.main;

import org.jberger.patterns.state.state.GenericData;

public class Main {
    public static void main(String[] args) {
        GenericData data1 = new GenericData(3.33);
        GenericData data2 = new GenericData(2);
        data1.add(data2);
        data2.add(data1);
        
        System.out.println(data1);
        System.out.println(data2);
        
        data1.convertToIntegerValue();
        data2.convertToDoubleValue();
        
        System.out.println(data1);
        System.out.println(data2);
    }
}