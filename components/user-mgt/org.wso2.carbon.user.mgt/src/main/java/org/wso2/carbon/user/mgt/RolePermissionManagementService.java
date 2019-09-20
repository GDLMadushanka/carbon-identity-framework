/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.user.mgt;

import org.wso2.carbon.user.mgt.common.UserAdminException;

public interface RolePermissionManagementService {

    /**
     * Get enabled set of permissions of a role.
     *
     * @param roleName group name
     * @return
     */
    String getRolePermissions(String roleName) throws UserAdminException;

    /**
     * Update(add or remove) set of permissions of a group/role.
     *
     * @param roleName group name
     * @param permissions array of permission resource paths
     */
    void updateRolePermissions(String roleName, String[] permissions) throws UserAdminException;

    /**
     * Get all set of permissions listed in the permission tree
     *
     * @return
     * @throws UserAdminException
     */
    String getAllPermissions() throws UserAdminException;
}
