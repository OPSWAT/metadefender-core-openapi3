# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response2006 import InlineResponse2006  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.new_user_role_request import NewUserRoleRequest  # noqa: E501
from openapi_server.models.new_user_role_response import NewUserRoleResponse  # noqa: E501
from openapi_server.models.user_request import UserRequest  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdminController(BaseTestCase):
    """AdminController integration test stubs"""

    def test_admin_import(self):
        """Test case for admin_import

        Import configuration
        """
        body = (BytesIO(b'some file data'), 'file.txt')
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/import',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_role_create(self):
        """Test case for role_create

        Create new role
        """
        new_user_role_request = {
  "rights" : {
    "scanlog" : "",
    "workflow" : "",
    "scan" : "",
    "rule" : "",
    "update" : "",
    "cert" : "",
    "skip" : "",
    "updatelog" : "",
    "users" : "",
    "agents" : "",
    "configlog" : "",
    "license" : "",
    "external" : "",
    "zone" : "",
    "engines" : "",
    "quarantine" : "",
    "retention" : ""
  },
  "name" : "new_role",
  "display_name" : "New MetaDefender User Role"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/role',
            method='POST',
            headers=headers,
            data=json.dumps(new_user_role_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_create(self):
        """Test case for user_create

        Create user
        """
        user_request = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/user',
            method='POST',
            headers=headers,
            data=json.dumps(user_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
