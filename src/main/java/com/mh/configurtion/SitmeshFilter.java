/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mh.configurtion;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 *
 * @author Mohammad Hossein
 */
public class SitmeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        SiteMeshFilterBuilder addDecoratorPath;
        addDecoratorPath = builder.addDecoratorPath("/*", "/WEB-INF/view/decorator/decorator.jsp");
    }
}
