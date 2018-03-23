package com.github.shehanperera.addfield;

import net.bytebuddy.asm.Advice;

public class SetField {

    @Advice.OnMethodExit
    public static void enter(@Advice.FieldValue(value = "bool", readOnly = false) boolean bool,
                             @Advice.FieldValue(value = "word", readOnly = false) String word)
            throws Exception {

        System.out.println("Adding boolean (true) and String (New String Field) Fields ");
        bool = true;
        word = "New String Field";

    }

}