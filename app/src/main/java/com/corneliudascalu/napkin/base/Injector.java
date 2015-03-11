package com.corneliudascalu.napkin.base;

import dagger.ObjectGraph;

/**
 * @author Corneliu Dascalu <corneliu.dascalu@gmail.com>
 */
public class Injector {

    private static ObjectGraph graph;

    public static void setGraph(ObjectGraph graph) {
        Injector.graph = graph;
    }

    public static ObjectGraph getGraph() {
        return graph;
    }

    public static <T> void inject(T target) {
        graph.inject(target);
    }
}
