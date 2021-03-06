/*
 * Copyright (C) 2018 Chan Chung Kwong
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.chungkwong.classifier;
import com.github.chungkwong.classifier.validator.*;
import java.util.stream.*;
/**
 * Model that can be trained
 * @author Chan Chung Kwong
 * @param <T> the type of the object that the model will be used to classify
 */
public interface Trainable<T>{
	/**
	 * Train the model
	 * @param data the data
	 * @param category the category of the data
	 */
	void train(T data,Category category);
	/**
	 * Train the model
	 * @param samples a stream of samples
	 */
	default void train(Stream<Sample<T>> samples){
		samples.forEach((sample)->train(sample.getData(),sample.getCategory()));
	}
}
