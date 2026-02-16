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
package fr.cea.deeplab.projectmgmt.impl;

import fr.cea.deeplab.projectmgmt.Dependency;
import fr.cea.deeplab.projectmgmt.DependencyLink;
import fr.cea.deeplab.projectmgmt.ProjectmgmtPackage;
import fr.cea.deeplab.projectmgmt.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.cea.deeplab.projectmgmt.impl.TaskImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends AbstractTaskImpl implements Task {
    /**
     * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDependencies()
     * @generated
     * @ordered
     */
    protected EList<DependencyLink> dependencies;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProjectmgmtPackage.Literals.TASK;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<DependencyLink> getDependencies() {
        if (this.dependencies == null) {
            this.dependencies = new EObjectContainmentEList<>(DependencyLink.class, this, ProjectmgmtPackage.TASK__DEPENDENCIES);
        }
        return this.dependencies;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProjectmgmtPackage.TASK__DEPENDENCIES:
                return ((InternalEList<?>) this.getDependencies()).basicRemove(otherEnd, msgs);
            default:
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ProjectmgmtPackage.TASK__DEPENDENCIES:
                return this.getDependencies();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProjectmgmtPackage.TASK__DEPENDENCIES:
                this.getDependencies().clear();
                this.getDependencies().addAll((Collection<? extends DependencyLink>) newValue);
                return;
            default:
                super.eSet(featureID, newValue);
                return;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ProjectmgmtPackage.TASK__DEPENDENCIES:
                this.getDependencies().clear();
                return;
            default:
                super.eUnset(featureID);
                return;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ProjectmgmtPackage.TASK__DEPENDENCIES:
                return this.dependencies != null && !this.dependencies.isEmpty();
            default:
                return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Dependency.class) {
            switch (derivedFeatureID) {
                case ProjectmgmtPackage.TASK__DEPENDENCIES:
                    return ProjectmgmtPackage.DEPENDENCY__DEPENDENCIES;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Dependency.class) {
            switch (baseFeatureID) {
                case ProjectmgmtPackage.DEPENDENCY__DEPENDENCIES:
                    return ProjectmgmtPackage.TASK__DEPENDENCIES;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // TaskImpl
