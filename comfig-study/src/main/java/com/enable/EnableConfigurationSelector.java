package com.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;

public class EnableConfigurationSelector extends AdviceModeImportSelector<EnableTest> {

    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        String name = EnableConfiguration.class.getName();
        return new String[]{name};
    }
}