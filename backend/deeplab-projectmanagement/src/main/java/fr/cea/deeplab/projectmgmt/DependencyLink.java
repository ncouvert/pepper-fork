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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Dependency Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.cea.deeplab.projectmgmt.DependencyLink#getTarget <em>Target</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.DependencyLink#getSource <em>Source</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.DependencyLink#getDependency <em>Dependency</em>}</li>
 * <li>{@link fr.cea.deeplab.projectmgmt.DependencyLink#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependencyLink()
 * @model
 * @generated
 */
public interface DependencyLink extends EObject {
    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute. The default value is <code>"START"</code>. The
     * literals are from the enumeration {@link fr.cea.deeplab.projectmgmt.StartOrEnd}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Target</em>' attribute.
     * @see fr.cea.deeplab.projectmgmt.StartOrEnd
     * @see #setTarget(StartOrEnd)
     * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependencyLink_Target()
     * @model default="START"
     * @generated
     */
    StartOrEnd getTarget();

    /**
     * Sets the value of the '{@link fr.cea.deeplab.projectmgmt.DependencyLink#getTarget <em>Target</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Target</em>' attribute.
     * @see fr.cea.deeplab.projectmgmt.StartOrEnd
     * @see #getTarget()
     * @generated
     */
    void setTarget(StartOrEnd value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute. The default value is <code>"END"</code>. The
     * literals are from the enumeration {@link fr.cea.deeplab.projectmgmt.StartOrEnd}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Source</em>' attribute.
     * @see fr.cea.deeplab.projectmgmt.StartOrEnd
     * @see #setSource(StartOrEnd)
     * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependencyLink_Source()
     * @model default="END"
     * @generated
     */
    StartOrEnd getSource();

    /**
     * Sets the value of the '{@link fr.cea.deeplab.projectmgmt.DependencyLink#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Source</em>' attribute.
     * @see fr.cea.deeplab.projectmgmt.StartOrEnd
     * @see #getSource()
     * @generated
     */
    void setSource(StartOrEnd value);

    /**
     * Returns the value of the '<em><b>Dependency</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dependency</em>' reference.
     * @see #setDependency(Dependency)
     * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependencyLink_Dependency()
     * @model required="true"
     * @generated
     */
    Dependency getDependency();

    /**
     * Sets the value of the '{@link fr.cea.deeplab.projectmgmt.DependencyLink#getDependency <em>Dependency</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Dependency</em>' reference.
     * @see #getDependency()
     * @generated
     */
    void setDependency(Dependency value);

    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #setDuration(int)
     * @see fr.cea.deeplab.projectmgmt.ProjectmgmtPackage#getDependencyLink_Duration()
     * @model
     * @generated
     */
    int getDuration();

    /**
     * Sets the value of the '{@link fr.cea.deeplab.projectmgmt.DependencyLink#getDuration <em>Duration</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
    void setDuration(int value);

} // DependencyLink
