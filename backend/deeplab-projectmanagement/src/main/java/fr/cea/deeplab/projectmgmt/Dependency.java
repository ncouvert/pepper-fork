/**
 * Copyright (c) 2024 CEA LIST.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package fr.cea.deeplab.projectmgmt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Dependency</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.cea.deeplab.projectmgmt.Dependency#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependency()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Dependency extends EObject {
    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list. The list contents are of type
     * {@link fr.cea.deeplab.projectmgmt.DependencyLink}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dependencies</em>' containment reference list.
     * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependency_Dependencies()
     * @model containment="true"
     * @generated
     */
    EList<DependencyLink> getDependencies();

} // Dependency
