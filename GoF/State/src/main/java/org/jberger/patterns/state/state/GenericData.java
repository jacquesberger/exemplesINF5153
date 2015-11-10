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

package org.jberger.patterns.state.state;

public class GenericData {
    private InternalState state;
    
    public GenericData(int data) {
        state = new IntegerState(data);
    }
    
    public GenericData(double data) {
        state = new DoubleState(data);
    }
    
    public void add(GenericData operand) {
        state.add(operand.state);
    }
    
    @Override
    public String toString() {
        return state.asString();
    }
    
    public void convertToIntegerValue() {
        state = new IntegerState(state.asInteger());
    }
    
    public void convertToDoubleValue() {
        state = new DoubleState(state.asDouble());
    }
}