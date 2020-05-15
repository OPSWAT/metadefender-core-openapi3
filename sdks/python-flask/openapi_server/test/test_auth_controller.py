# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_object import InlineObject  # noqa: E501
from openapi_server.models.inline_object2 import InlineObject2  # noqa: E501
from openapi_server.models.inline_response403 import InlineResponse403  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.user_login import UserLogin  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuthController(BaseTestCase):
    """AuthController integration test stubs"""

    def test_user_change_pass(self):
        """Test case for user_change_pass

        Change Password
        """
        inline_object2 = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/user/changepassword',
            method='POST',
            headers=headers,
            data=json.dumps(inline_object2),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_login(self):
        """Test case for user_login

        Login
        """
        inline_object = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/login',
            method='POST',
            headers=headers,
            data=json.dumps(inline_object),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_logout(self):
        """Test case for user_logout

        Logout
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/logout',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
