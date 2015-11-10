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

class DoubleState implements InternalState {
    private double state;
    
    public DoubleState(double state) {
        this.state = state;
    }
    
    @Override
    public int asInteger() {
        return (int) Math.round(state);
    }

    @Override
    public double asDouble() {
        return state;
    }

    @Override
    public String asString() {
        return Double.toString(state);
    }

    @Override
    public void add(InternalState operand) {
        state += operand.asDouble();
    }
}