/*
 * Copyright 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.fragmenttransition;

/**
 * This represents a sample data.
 */
public class Meat {

    public int resourceId;
    public String title;

    public Meat(int resourceId, String title) {
        this.resourceId = resourceId;
        this.title = title;
    }

    public static final Meat[] MEATS = {
            new Meat(R.drawable.p1, "Fillinger Bendegúz"),
            new Meat(R.drawable.p2, "Botor Roland"),
            new Meat(R.drawable.p3, "Poros Gergely"),
            new Meat(R.drawable.p4, "Poros Anna"),
            new Meat(R.drawable.p5, "Rákóczi Botond"),
            new Meat(R.drawable.p6, "Rákóczi Bánk"),
            new Meat(R.drawable.p7, "Tóth Tamás"),
            new Meat(R.drawable.p8, "Báldi Alma"),
            new Meat(R.drawable.p9, "Kurva"),
            new Meat(R.drawable.p10, "Kurva"),
            new Meat(R.drawable.p11, "Kurva"),
    };

}
