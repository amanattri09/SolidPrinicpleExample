package com.example.solidprincipleexample.b_open_closed.example3.solution.quack

import com.example.solidprincipleexample.b_open_closed.example3.solution.Duck2
import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.NoFlyImp

class RubberDuck():Duck2(NoFlyImp(),SilentDuckImp()) {
}